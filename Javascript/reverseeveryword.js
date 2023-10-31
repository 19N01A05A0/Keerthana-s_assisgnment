const ex=prompt("Enter input")
const words=ex.split(" ")
const reversedWords = [];

  for (const word of words) {
    let reversedWord = '';
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i]; 
    }
    reversedWords.push(reversedWord);
  }

  const reversedSentence = reversedWords.join(' '); 

console.log(reversedSentence)