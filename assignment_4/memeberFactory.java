package assignment_4;
public class memeberFactory {
  public staff getmemeber(String MemeberName){  
        if(MemeberName==null)
        {
            return null;
        }
        if(MemeberName.equalsIgnoreCase("TEACHINGASSISTANT"))
        {
            return new TeachingAssistant();
        }
        if(MemeberName.equalsIgnoreCase("DOCTOR"))
        {
            return new Dr();
        }
        return null;  
    }  
}
