public class Song {
    //Fields
    private String name;
    private String completionStatus;
    private String need;
    private String priority;
    private String reason;
    private String recommendedFocus;
    private String smallGoal;
    //Constructor
    public Song (String name, String completionStatus,
                 String need, String priority, String reason,
                 String recommendedFocus, String smallGoal){
        this.name = name;
        this.completionStatus = completionStatus;
        this.need = need;
        this.priority = priority;
        this.reason = reason;
        this.recommendedFocus = recommendedFocus;
        this.smallGoal = smallGoal;
    }
    //setter and getters
    public void setName(String name){
        this.name = name;
    }
    public void setCompletionStatus(String completionStatus){
        this.completionStatus = completionStatus;
    }
    public void setNeed(String need){
        this.need = need;
    }
    public void setPriority(String priority){
        this.priority = priority;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
    public void setRecommendedFocus(String recommendedFocus){
        this.recommendedFocus = recommendedFocus;
    }
    public void setSmallGoal(String smallGoal){
        this.smallGoal = smallGoal;
    }
    public String getName(){
        return name;
    }
    public String getCompletionStatus(){
        return completionStatus;
    }
    public String getNeed(){
        return need;
    }
    public String getPriority(){
        return priority;
    }
    public String getReason(){
        return reason;
    }
    public String getRecommendedFocus(){
        return recommendedFocus;
    }
    public String getSmallGoal(){
        return smallGoal;
    }

    @Override
    public String toString() {
        return
                "------------------------\n" +
                        "SONG ADDED SUCCESSFULLY\n" +
                        "------------------------\n\n" +
                        "song: " + name +
                        "\nCompletion: " + completionStatus +
                        "\nNeeds: " + need+
                        "\nPriority: " + priority +
                        "\nReason: " + reason+
                        "\nRecommended Focus: " + recommendedFocus +
                        "\nSmall Goal: " + smallGoal ;
    }
}
