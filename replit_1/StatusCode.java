public class StatusCode {
    public static void main(String[] args) {
        int Status=300;
        String msg="";

        if (Status==200)  {
           msg="Ok";
        }else if (Status==201){
            msg="Created";
        }else if (Status==202){
            msg="Accepted";
        }else if (Status==301){
            msg="MovedPermanently";
        }else if (Status==303){
            msg="SeeOther";
        }else if (Status==304){
            msg="NotModified";
        }else if (Status==307){
            msg="TemporaryRedirect";
        }else if (Status==400){
            msg="BadRequest";
        }else if (Status==401){
            msg="Unauthorized";
        }else if (Status==403){
            msg="Forbidden";
        }else if (Status==404){
            msg="NotFound";
        }else if (Status==410){
            msg="Gone";
        }else if (Status==500){
            msg="InternalServerError";
        }else if (Status==503){
            msg="ServiceUnavailable";
        }else{
            msg="Invalid status code!";
        }
        System.out.println(msg);
    }
}
