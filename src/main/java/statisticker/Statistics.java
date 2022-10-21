package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        public float average(List<Float> numbers) {
         return numbers.stream()
                .average()
                .orElse(0.0);
        }
        
        public float max(List<Float> numbers) {
         return Collections.max(numbers);
        }
        
        public float min(List<Float> numbers) {
         return Collections.min(numbers);
        }
        
    }
}
