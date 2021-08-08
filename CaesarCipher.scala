object CaesarCipher extends App{

	//Define Alphabet
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


	//We will shift our plaintext by this much
	val shift = (scala.io.StdIn.readLine("Enter shift Encrypt-positive no, Decrypt-negetive no: ").toInt + alphabet.size) % alphabet.size

	//What is the code we want to encrypt/decrypt
	val inputText = scala.io.StdIn.readLine("Message: ")

	//Lets Encrypt/Decrypt the code
	val outputText = inputText.map( (c: Char) => { 

		//We find the c char in our allowed alphabet
		val x = alphabet.indexOf(c.toUpper)

		//If the c char is in our alphabet then we encrypt it 
		//If it is not then we leave it be.
		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});

	//Print the result
	println(outputText);
}