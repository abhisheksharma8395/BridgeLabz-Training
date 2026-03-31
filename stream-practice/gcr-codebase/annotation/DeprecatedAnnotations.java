package annotation;

public class DeprecatedAnnotations {
    public static void main(String[] args) {
        // Created the object of LegacyAPI class
        LegacyAPI api = new LegacyAPI();
        // Using the method oldFeature of LegacyAPI class which is marked as Deprecated
        api.oldFeature();        // Compile warning is oldFeature() is deprecated
        // Using the method newFeature of LegacyAPI class which is marked as Deprecated
        api.newFeature();
    }
}

// Class LegacyApi
class LegacyAPI{
    // Method oldFeature of LegacyAPI class marked as Deprecated
    @Deprecated
    public void oldFeature(){
        System.out.println("I am the old Method");
    }

    // Method newFeature of LegacyAPI class
    public void newFeature(){
        System.out.println("I am the new Method");
    }
}
