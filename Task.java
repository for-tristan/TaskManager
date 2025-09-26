package tskmngr;

public class Task {
  private String title;
    private boolean completed;
    final String Neutral = "\u001B[0m";
    final String Red = "\u001B[31m";
    final String Green = "\u001B[32m";
    
     public Task(String title) {
                this.title = title;
                    this.completed = false;
           }

          public String Title() {
        return title;
             }

    public boolean Done() {
                 return completed;
         }

             public void setcompleted() {
        this.completed = true;
    }

                        @Override
    public String toString() {
        return title + (completed ? Green + " is done " + Neutral : Red + " is not done " + Neutral);
                }
}




