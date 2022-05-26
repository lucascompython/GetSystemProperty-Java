import java.util.Properties;
import java.util.Enumeration;

public class GetSystemProperty {
    public static void main(String args[]) {
        if( args.length == 0 ) {
            Properties p = System.getProperties();
            Enumeration keys = p.keys();
            while (keys.hasMoreElements()) {
                String key = (String)keys.nextElement();
                String value = (String)p.get(key);
                System.out.println(key + " : " + value);
            }
        }
        else {
            if ( args[0].equals("--help") || args[0].equals("-h") ){
                System.out.println("Usage: java GetSystemProperty <property> (if none is specified, all properties are printed)");
                return;
            }
            for (String key: args) {
                System.out.println(System.getProperty( key ));
            }
        }
    }
}