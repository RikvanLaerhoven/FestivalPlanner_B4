package performance;

/***
 *  @author  Boris Korevaar
 *
 *  Stage is een class waar een podium wordt gedefineerd.
 *
 */
public class Stage implements java.io.Serializable{

    private String      name;
    private Performance performance;

    public Stage(){
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return name;
    }

    public Performance getPerformance() {
        return this.performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }
}
