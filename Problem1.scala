/**
  * Created by rutvik on 23/8/16.
  */
class Problem1 {

}
private object Problem1{
  def filter(number: Int): Int = {
    def sumOfMultiplesof3and5(firstno: Int, secondno: Int, limitno: Int): Int = {
      def sameOrNot(inputone: Int,inputtwo: Int) : Int = {
        if(inputone + 3 == inputtwo)
          -inputone-3
        else
          0
      }
      if(firstno < limitno && firstno <= secondno){
        println(firstno);
        firstno + sameOrNot(firstno,secondno) + sumOfMultiplesof3and5(firstno+3,secondno,limitno)
      }
      else if(secondno < limitno && secondno <= firstno){
        println(secondno);
        secondno + sumOfMultiplesof3and5(firstno,secondno+5,limitno); }
      else
        0;
    }
    if(number <= 0)
      throw new NoSuchElementException
    else
      sumOfMultiplesof3and5(0,0,number)
  }
  def main(args: Array[String]): Unit = {
    println(filter(10))
  }
}