package anushka;

public class conditional_loops {
    public static void main(String[] args) {
        // when u dont know how many times the loop is going to run use while loop else use for loop
        /*syntax of if statement
        if(boolean expression T or F){
        //body
        }else{
        //do this
        }
         */
        int salary =25400;
//        if(salary > 10000){
//            salary = salary + 2000;
//        } else{
//            salary = salary + 1000;
//        }

        // Multiple if else statements

        if(salary > 10000){
            salary += 2000; // salary = salary + 2000
        }else if (salary > 20000){
            salary += 3000;
        } else{ //this else basically mean if none of the above statement is true then execute this staement
            salary += 1000;
        }

        System.out.println(salary);
    }
}

