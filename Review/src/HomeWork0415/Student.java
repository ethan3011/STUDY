package HomeWork0415;

public class Student implements Comparable<Student>{
		
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int total;
		private int average;
		
		public Student() {}
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.total = kor+eng+math;
			this.average = total/3;
		}
		public String getName() {
			return name;
		}
		public int getKor() {
			return kor;
		}
		public int getEng() {
			return eng;
		}
		public int getMath() {
			return math;
		}
		public int getTotal() {
			return total;
		}
		public int getAverage() {
			return average;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + average;
			result = prime * result + eng;
			result = prime * result + kor;
			result = prime * result + math;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + total;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (average != other.average)
				return false;
			if (eng != other.eng)
				return false;
			if (kor != other.kor)
				return false;
			if (math != other.math)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (total != other.total)
				return false;
			return true;
		}
		
		@Override
		public int compareTo(Student other) {
			return this.total - other.total;
		}
}
