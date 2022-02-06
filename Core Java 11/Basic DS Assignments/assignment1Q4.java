
class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
    	String result = " ";
    	if(subject1Marks >=60 && subject2Marks >=60 && subject3Marks >= 60) {
    		result = "Passed";
    		System.out.println(result);
    	} 
    	else if ((subject1Marks<60 && subject2Marks<60 && subject3Marks<60)||(subject1Marks>=60 && subject2Marks<60 && subject3Marks<60)||
    			(subject1Marks<60 && subject2Marks>=60 && subject3Marks<60)||(subject1Marks<60 && subject2Marks<60 && subject3Marks>=60)) {
    		result = "Failed";
    		System.out.println(result);
    	}
    	else if ((subject1Marks>60 && subject2Marks>60)||(subject2Marks>60 && subject3Marks>60)||(subject1Marks>60 && subject3Marks>60)) {
    		result = "Promoted";
    		System.out.println(result);
    	}
    	return result;
    }
}
public class assignment1Q4 {
    public static void main(String[] args) {
        ResultDeclaration rd = new ResultDeclaration();
        rd.declareResults(10,10,10);
        rd.declareResults(70,10,10);
        rd.declareResults(10,20,40);
        rd.declareResults(10,30,40);
        rd.declareResults(65, 70, 20);
    }
}
