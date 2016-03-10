import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;


public class Scan_table {
private static Table table;
	
	public static void main(String[] args) throws Exception {
		Connectx conx =new Connectx();
	table =conx.connect_rest_get_table("htest144");//htest144==> name the table
	// Table tablex=table;
		 
		System.out.println("scan");
      Scan scan1=new Scan();
      System.out.println("fin scan");
       
      System.out.println("getscan1");
      ResultScanner scanner1=null;
      try {
      	   scanner1=table.getScanner(scan1);
      	   
    		} catch (Exception e) {
    			// TODO: handle exception
    		   System.out.println("error getscan1==>"+e.getMessage());
    		}
      System.out.println("fin getscan1");
      
      
      System.out.println("Result");
      for(Result res:scanner1){
      System.out.println(res);
      }
      
      //example tesult====>
//      keyvalues={1/cf:column1/1457546593066/Put/vlen=10/seqid=0}
//      keyvalues={2/cf:column2/1457546621854/Put/vlen=10/seqid=0}
      
      
      System.out.println("=========fin Resul================");
      
      scanner1.close();
	 
 
		
    }
    
}
