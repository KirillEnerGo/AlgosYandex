package first_difficult_testing_someExamples

fun main() {
	println("Enter the string")
	val s = readLine().toString()
	println(s)
	val setString = s.toSet()
	println(setString)
	findCountLetter(s, setString)
	findCountLetterDict(s, setString)
}

fun	findCountLetter(s: String, set: Set<Char>){
	var anscnt = 0
	var ans = ' '
	for (i in 0..set.size){
		var nowcnt = 0
		for (j in 0..s.lastIndex){
			if (s[i] == s[j]){
				nowcnt += 1
			}
			if (nowcnt > anscnt){
				ans = s[i]
				anscnt = nowcnt
			}
		}
	}
	println("$ans = ${anscnt} times in [$s]")
}
fun	findCountLetterDict(s: String, set: Set<Char>){
	var anscnt = 0
	var n = 0
	var ans = ' '
	var dict = hashMapOf<Char, Int>()
	for (now in 0..s.lastIndex){
		if (!dict.containsKey(s[now])){
			dict[s[now]] = n
		}
		dict[s[now]] = ++n
		if(dict[s[now]]!! > anscnt){
			ans = dict[s[now]].key
			anscnt = dict[s[now]]!!
		}

	}
	println("$ans = ${anscnt} times in [$s]")
}