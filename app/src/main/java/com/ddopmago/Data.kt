fun pinyin(s: String) = s.filter { isYi(it) }.joinToString(" ") { map[it] ?: "?" }
