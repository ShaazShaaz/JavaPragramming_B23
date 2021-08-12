package Recap;

public class Http {
    public static void main(String[] args) {
        /*
        HTTP is the protocol that governs communications between web-servers and web clients.
         Part of the protocol includes a status code returned by the server to tell the browser the
         status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable


         declare an int variable called StatusCode
         write a if statement that prints out, on a line by itself, the appropriate label from the
         above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok
         */
        int StatusCode=200;

             if (StatusCode==200)  {
                 System.out.println("Ok");
             }else if (StatusCode==201){
                 System.out.println("Created");
             }else if (StatusCode==202){
                 System.out.println("Accepted");
             }else if (StatusCode==301){
                 System.out.println("MovedPermanently");
             }else if (StatusCode==303){
                 System.out.println("SeeOther");
             }else if (StatusCode==304){
                 System.out.println("NotModified");
             }else if (StatusCode==307){
                 System.out.println("TemporaryRedirect");
             }else if (StatusCode==400){
                 System.out.println("BadRequest");
             }else if (StatusCode==401){
                 System.out.println("Unauthorized");
             }else if (StatusCode==403){
                 System.out.println("Forbidden");
             }else if (StatusCode==404){
                 System.out.println("NotFound");
             }else if (StatusCode==410){
                 System.out.println("Gone");
             }else if (StatusCode==500){
                 System.out.println("InternalServerError");
             }else if (StatusCode==503){
                 System.out.println("ServiceUnavailable");
             }
             }
    }

