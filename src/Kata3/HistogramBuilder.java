
package Kata3;

public class HistogramBuilder<Type> {
    
    public Histogram<Type> build(Type[] tipes){
        Histogram<Type> histogram = new Histogram<>();
        
        for (Type type : tipes)
            histogram.put(type, histogram.get(type)+1);
        return histogram;
    }    
    
    
}
