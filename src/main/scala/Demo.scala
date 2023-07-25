import scala.io.StdIn.readLine

object Demo {

  def encryption(text: String, shift: Int): String = {
    val encryptedText = new StringBuilder()

    for (i <- 0 to text.length-1) {
      var encryptedChar = ' '
      if(text.charAt(i) != ' '){
        encryptedChar = (text.charAt(i) + shift).toChar
      }
      encryptedText.append(encryptedChar)
    }
    encryptedText.toString()
  }

  def decryption(text: String, shift: Int): String = {
    val decryptedText= new StringBuilder()

    for (i <- 0 to text.length - 1) {
      var decryptedChar = ' '
      if (text.charAt(i) != ' ') {
        decryptedChar = (text.charAt(i) - shift).toChar
      }
      decryptedText.append(decryptedChar)
    }
    decryptedText.toString()
  }


  def main(args : Array[String]): Unit = {
    print("Enter plaintext : ")
    var text = readLine()

    print("Enter shift count : ")
    var shift = readLine().toInt

    var encryptedText = encryption(text,shift)
    println(encryptedText)

    println(decryption(encryptedText,shift))

  }
}
