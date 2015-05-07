package domain;

import java.util.Map;

public class Dict {
	public Dict() {
	}

	public Dict(Map<String, String[]> params) {
		if (params.containsKey(Columns.user_id)) {
			setUser_id(params.get(Columns.user_id)[0]);
		}
		if (params.containsKey(Columns.word_id)) {
			setWord_id(params.get(Columns.word_id)[0]);
		}
		if (params.containsKey(Columns.word)) {
			setWord(params.get(Columns.word)[0]);
		}
		if (params.containsKey(Columns.uk_phonetic)) {
			setUk_phonetic(params.get(Columns.uk_phonetic)[0]);
		}
		if (params.containsKey(Columns.us_phonetic)) {
			setUs_phonetic(params.get(Columns.us_phonetic)[0]);
		}
		if (params.containsKey(Columns.word_time)) {
			setWord_time(params.get(Columns.word_time)[0]);
		}
	}

	public String user_id; // 用户id
	public String word_id; // 单词id
	public String word; // word //单词
	public String uk_phonetic; // 英语音标
	public String us_phonetic; // 美国音标
	public String word_time; // 时间

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getWord_id() {
		return word_id;
	}

	public void setWord_id(String word_id) {
		this.word_id = word_id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getUk_phonetic() {
		return uk_phonetic;
	}

	public void setUk_phonetic(String uk_phonetic) {
		this.uk_phonetic = uk_phonetic;
	}

	public String getUs_phonetic() {
		return us_phonetic;
	}

	public void setUs_phonetic(String us_phonetic) {
		this.us_phonetic = us_phonetic;
	}

	public String getWord_time() {
		return word_time;
	}

	public void setWord_time(String word_time) {
		this.word_time = word_time;
	}

	public String getWord_type() {
		return word_type;
	}

	public void setWord_type(String word_type) {
		this.word_type = word_type;
	}

	public String getWord_similar() {
		return word_similar;
	}

	public void setWord_similar(String word_similar) {
		this.word_similar = word_similar;
	}

	public String getWord_ch() {
		return word_ch;
	}

	public void setWord_ch(String word_ch) {
		this.word_ch = word_ch;
	}

	public String getWord_sentence() {
		return word_sentence;
	}

	public void setWord_sentence(String word_sentence) {
		this.word_sentence = word_sentence;
	}

	public String getWord_en() {
		return word_en;
	}

	public void setWord_en(String word_en) {
		this.word_en = word_en;
	}

	public String word_type; // 类型
	public String word_similar; // 同义词
	public String word_ch; // 中文翻译
	public String word_sentence; // 造句
	public String word_en; // 英语解释/

	public class Columns {
		// 故障ID
		public final static String user_id = "user_id";// 用户id
		public final static String word_id = "word_id ";// 单词id
		public final static String word = "word";// 单词
		public final static String uk_phonetic = "uk_phonetic";// 英语音标
		public final static String us_phonetic = "us_phonetic";// 美国音标
		public final static String word_time = "word_time";// 时间
		public final static String word_type = "word_type";// 类型
		public final static String word_similar = "word_similar";// 同义词
		public final static String word_ch = "word_ch";// 中文翻译
		public final static String word_sentence = "word_sentence";// 造句
		public final static String word_en = "word_en";// 英语解释/
	}

}
