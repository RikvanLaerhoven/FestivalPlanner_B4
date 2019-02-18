package Performance;

/**
 * @author Boris Korevaar & Rafael Binnenmarsch
 */
public interface Stages {

    void setBeginTime(int temp);
    int getBeginTime();

    void setEndTime(int temp);
    int getEndTime();

    void setName(String temp);
    String getName();
}
