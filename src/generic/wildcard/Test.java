package generic.wildcard;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인", 5);
		/* Person이 최상위라서 상속 받는 모든 게 다 들어감 */
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));

		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);

		System.out.println("===================");
		System.out.println("===================");
		System.out.println("===================");

		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);

		System.out.println("===================");
		System.out.println("===================");
		System.out.println("===================");

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
	}

	// 모든 과정
	public static void registerCourse(Course<?> corse) {
		System.out.println(corse.getName() + "수강생: " + Arrays.toString(corse.getStudents()));
	}

	// 수강생 코스
	public static void registerCourseStudent(Course<? extends Student> corse) {
		System.out.println(corse.getName() + "수강생: " + Arrays.toString(corse.getStudents()));
	}

	// 직장인 코스
	public static void registerCourseWorker(Course<? super Worker> corse) {
		System.out.println(corse.getName() + "수강생: " + Arrays.toString(corse.getStudents()));
	}
}