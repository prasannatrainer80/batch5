var Questions = [
    "The father of C, C++ & Unix is",
    "The Open source among following is  ",
    "Pancake Sorting Algorithm and BASIC Interpreter was written by",
    "Larry page and Sergei Brinn are Co-Founders of ",
    "The first computer to defeat Chess Grandmaster was"
];
var QuestionNo = 0;
var totalQuestions = Questions.length;
var Answers = new Array(totalQuestions);
for(var v=0; v < totalQuestions; v++) {
    Answers[v] = new Array(4);
}
Answers[0][0] = "Forouzan";
Answers[0][1] = "Dennis Ritchie";
Answers[0][2] = "Andrew Tenenbaum";
Answers[0][3] = "Dijkstra";

Answers[1][0] = "Windows XP";
Answers[1][1] = "Mac OS X";
Answers[1][2] = "Linux Ubuntu";
Answers[1][3] = "Sun Solaris";

Answers[2][0] = "Steve Jobs";
Answers[2][1] = "Steve William";
Answers[2][2] = "Bill Gates";
Answers[2][3] = "Jerry yang";

Answers[3][0] = "Yahoo";
Answers[3][1] = "Rediff";
Answers[3][2] = "Google";
Answers[3][3] = "Apple";

Answers[4][0] = "Chess Zeus";
Answers[4][1] = "Armageddon";
Answers[4][2] = "White Knight";
Answers[4][3] = "Deep Blue";

function loadQuestion() {
    document.getElementById("Question").innerHTML = "("+ (QuestionNo+1) + ")  "+ Questions[QuestionNo];
    document.getElementById("Option0").innerHTML = Answers[QuestionNo][0];
    document.getElementById("Option1").innerHTML = Answers[QuestionNo][1];
    document.getElementById("Option2").innerHTML = Answers[QuestionNo][2];
    document.getElementById("Option3").innerHTML = Answers[QuestionNo][3];
    document.getElementById("Opt1").checked = false;
    document.getElementById("Opt2").checked = false;
    document.getElementById("Opt3").checked = false;
    document.getElementById("Opt4").checked = false;   	
}

function nextQuestion() {
    QuestionNo++;
    loadQuestion();   
}