import org.apache.hadoop.hbase.rest.client.Client;
import org.apache.hadoop.hbase.rest.client.Cluster;
import org.apache.hadoop.hbase.rest.client.RemoteHTable;


public class Connectx {

	private static RemoteHTable table;

	
	public Client connect_rest(){
		//run this code
		//hbase rest start -p 8080
		//=====on terminal 
		Cluster hbaseCluster = new Cluster();
		System.out.println("hbaseCluster ");
		hbaseCluster.add("192.168.56.101",  8080);
		 
		System.out.println("fin hbaseCluster ");

		System.out.println("restClient ");
		// Create Rest client instance and get the connection
		Client restClient = new Client(hbaseCluster);
		System.out.println("fin restClient ");
		return restClient; 
		
	}
	
	public RemoteHTable connect_rest_get_table(String table_name){
		Client restClient =	this.connect_rest();
		 System.out.println("  RemoteHTable ");
		table = new RemoteHTable(restClient, table_name);
		 System.out.println("fin  RemoteHTable ");
		 return table;
	}
	
}
