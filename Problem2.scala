/**
  * Created by rutvik on 23/8/16.
  */
class Problem2 {

}
private object Problem2{
  def filter(number: Int): Int = {

    def sumofevennosoffibonacci(firstno: Int, secondno: Int,limitno: Int): Int = {

      def evenornot(inputone: Int, inputtwo: Int) : Int= {
        if(inputone % 2 == 0 && inputtwo % 2 == 0)
          inputone + inputtwo
        else if(inputone % 2 == 0)
          inputone
        else
          0
      }
      if(firstno < limitno || secondno < limitno)
          evenornot(firstno,secondno) + sumofevennosoffibonacci(secondno,firstno+secondno,limitno)
      else
        0
    }
    if(number <= 0)
      throw new NoSuchElementException
    else
      sumofevennosoffibonacci(0,1,number)
  }
  def main(args:Array[String]): Unit = {
    println(filter(4000001))
  }
}