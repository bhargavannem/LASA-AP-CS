import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
public class LocaleLoader {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<AbstractLocale> locales = getLocales();
    // Your code goes here.
    for(int i = 0; i < locales.size(); i++){
      System.out.println("" + (i + 1) + ". " + locales.get(i).getLocation() + " (" + locales.get(i).getLanguage() + ")");
    }
    System.out.print("What locale do you want? ");
    String user_location = sc.nextLine();
    int index_of = 0;
    for(int j = 0; j < locales.size(); j++){
      AbstractLocale al = locales.get(j);
      if (al.getLocation().equals(user_location)){
        index_of = j;
      }
    }
    AbstractLocale user = locales.get(index_of);
    System.out.println(user.getGreeting());
    
    System.out.println("What's the hour? ");
    int hour = sc.nextInt();
    sc.nextLine();
    
    System.out.println("What's the minute? ");
    int minute = sc.nextInt();
    sc.nextLine();
    System.out.println("The local time is " + user.getLocalTime(hour, minute));
/*
    How much money do you have in your 
    wallet or purse? <user input>
In <location>, that’s worth
    <currency symbol><currency value>!
    */

    System.out.println("How much money do you have in your wallet or purse? ");
    double money = sc.nextDouble();
    System.out.println("In " + user.getLocation() + ", that's worth " + user.getCurrencySymbol() + user.getCurrencyValue(money));
    sc.close();
  }

  /**
   * DO NOT MODIFY THIS METHOD.
   * Scans the directory of your .java file for all implementations of
   * AbstractLocale, instantiates them, and puts them in an ArrayList.
   * @return the list of locale implementations.
   */
  public static ArrayList<AbstractLocale> getLocales() {
    ArrayList<AbstractLocale> locales = new ArrayList<AbstractLocale>();
    File pwd = new File(
        ClassLoader.getSystemClassLoader().getResource("").getPath());
    File[] classFiles = pwd.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
          return name.endsWith(".class");
        }});
    for(File f : classFiles) { 
      String className = f.getName().replace(".class", "");
      try {
        Class<?> c = Class.forName(className);
        if (!c.getName().equals("AbstractLocale")) {
          Object obj = c.newInstance();
          if (obj instanceof AbstractLocale)
            locales.add((AbstractLocale)obj);
        }
      } catch (ClassNotFoundException e) {
        System.err.println("Class not found: " + className);
      } catch (InstantiationException e) {
        System.err.println("Error instantiating the object: " + className);
      } catch (IllegalAccessException e) {
        System.err.println("Invalid method access for " + className);
      }
    }
    return locales;
  }
}
