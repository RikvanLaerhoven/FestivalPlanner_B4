package performance;

/***
 *  Gemaakt door Boris Korevaar
 *
 *  Genre is een class waar een Genre wordt gedefineerd en informatie over wordt vrijgegeven.
 *
 */
public class Genre implements java.io.Serializable {

    private String name;
    private String info;

    public Genre(){

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getInfo()
    {
        return info;
    }

    public String toString(){
        return(name);
    }
}
