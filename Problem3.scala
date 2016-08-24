/**
  * Created by rutvik on 23/8/16.
  */
class Problem3 {

}
private object Problem3{
  def filter(number: Long): Long = {
    def largestprimenumber(factor: Long,testnumber: Long): Long = {
      if(testnumber == 1)
        factor
      else if(testnumber % factor == 0)
        largestprimenumber(factor,testnumber/factor)
      else {
        if(factor == 2)
          largestprimenumber(factor + 1, testnumber)
        else
          largestprimenumber(factor + 2, testnumber)
      }
    }
    if(number <= 0)
      throw new NoSuchElementException
    else
      largestprimenumber(2,number)
  }
  def main(args:Array[String]):Unit = {
    println(filter(600851475143L))
  }
}