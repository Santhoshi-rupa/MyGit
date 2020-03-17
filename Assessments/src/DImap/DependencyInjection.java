package DImap;
import java.util.Iterator;
import java.util.Map;
public class DependencyInjection 
{
	      private Map<String,String>ans;
	       private Address address;
	       public Map<String, String> getAns() {
	              return ans;
	       }
	       public void setAns(Map<String, String> ans) {
	              this.ans = ans;}
	       public DependencyInjection(Map<String, String> ans,Address address) {
	              super();
	       
	              this.ans = ans;
	              this.address=address;
	       }
	       public void show() {
	              Iterator it=ans.keySet().iterator();
	              while(it.hasNext()) {
	                     String key=(String)it.next();
	                     System.out.println(key +" Question is answered by "  +ans.get(key)+ " from "+address.city);
	              }      
	       }
	}

