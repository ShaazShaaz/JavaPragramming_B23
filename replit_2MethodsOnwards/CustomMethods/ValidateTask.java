package CustomMethods;

public class ValidateTask {
    /*
    We have a to do list app, every time a user adds a task - a few things needed to be checked.
It should not be empty. (boolean parameter needs to be true)
taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7) so the next
 task id is 8 , it can't be 10.
Example:
validateTask(true,2,1)
returns true
     */
    public static void main(String[] args) {
        boolean result=validateTask(2>1,3,1);
        System.out.println("result = " + result);
    }

    public static boolean validateTask(boolean isEmpty,int taskId, int currentId){
        return (isEmpty=true && taskId==currentId+1)?true:false;

    }



}
