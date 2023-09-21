package day9class;

public class Voteeligible {
   public String findVoteeligible(int num) {
	   if(num >= 18) {
	   return num+" IS ELIGIBLE FOR VOTING";
   }
	   else {
		   return num + " IS NOT ELIGIBLE FOR VOTING";
	   }
   }
}
