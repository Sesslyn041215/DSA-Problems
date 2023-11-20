
// let sent = "He is a good boy"
// let search = "good"
// let change = "bad"
// let add = ""
// let n = sent.length
// for(i=0; i<n; i++){
//     for(j=0; j<search.length; j++){
//         if(sent[i] === search[j]){
//             add += sent[i]
//             // add += i + " ";
//             break;
//         }
//         if(add == search){
//             break;
//         }
//     }
// }
// console.log(add) 


var sentence = "He is a good boy";
var oldWord = "good boy";
var newWord = "bad girl";

var words = sentence.split(/\s+/); 
for (let i = 0; i < words.length; i++) {
  if (words[i] === oldWord) {
    words[i] = newWord;
  }
}
var newSentence = words.join(" ");
console.log(newSentence);

