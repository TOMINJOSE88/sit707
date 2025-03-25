package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "224353043";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Tomin jose";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("January1 Should Increment To January2 " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2, date.getDay());

	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("January1 Should Decrement To December31 " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(31, date.getDay());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test
	public void testFebruary1ShouldIncrementToFebruary2() {
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("February1 Should Increment To February2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testFebruary1ShouldDecrementToJanuary31() {
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("February1 Should Decrement To January31 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}
	
	@Test
	public void testMarch1ShouldIncrementToMarch2() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("March1 Should Increment To March2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMarch1ShouldDecrementToFebruary29() { // 2024 is a leap year
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("March1 Should Decrement To February29 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(29, date.getDay());
	}

	@Test
	public void testApril1ShouldIncrementToApril2() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("April1 Should Increment To April2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testApril1ShouldDecrementToMarch31() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("April1 Should Decrement To March31 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}

	@Test
	public void testMay1ShouldIncrementToMay2() {
	    DateUtil date = new DateUtil(1, 5, 2024);
	    System.out.println("May1 Should Increment To May2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMay1ShouldDecrementToApril30() {
	    DateUtil date = new DateUtil(1, 5, 2024);
	    System.out.println("May1 Should Decrement To April30 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}

	@Test
	public void testJune1ShouldIncrementToJune2() {
	    DateUtil date = new DateUtil(1, 6, 2024);
	    System.out.println("June1 Should Increment To June2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testJune1ShouldDecrementToMay31() {
	    DateUtil date = new DateUtil(1, 6, 2024);
	    System.out.println("June1 Should Decrement To May31 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}

	@Test
	public void testJuly1ShouldIncrementToJuly2() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    System.out.println("July1 Should Increment To July2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testJuly1ShouldDecrementToJune30() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    System.out.println("July1 Should Decrement To June30 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}

	@Test
	public void testAugust1ShouldIncrementToAugust2() {
	    DateUtil date = new DateUtil(1, 8, 2024);
	    System.out.println("August1 Should Increment To August2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testAugust1ShouldDecrementToJuly31() {
	    DateUtil date = new DateUtil(1, 8, 2024);
	    System.out.println("August1 Should Decrement To July31 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}

	@Test
	public void testSeptember1ShouldIncrementToSeptember2() {
	    DateUtil date = new DateUtil(1, 9, 2024);
	    System.out.println("September1 Should Increment To September2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testSeptember1ShouldDecrementToAugust31() {
	    DateUtil date = new DateUtil(1, 9, 2024);
	    System.out.println("September1 Should Decrement To August31 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}

	@Test
	public void testOctober1ShouldIncrementToOctober2() {
	    DateUtil date = new DateUtil(1, 10, 2024);
	    System.out.println("October1 Should Increment To October2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testOctober1ShouldDecrementToSeptember30() {
	    DateUtil date = new DateUtil(1, 10, 2024);
	    System.out.println("October1 Should Decrement To September30 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}

	@Test
	public void testNovember1ShouldIncrementToNovember2() {
	    DateUtil date = new DateUtil(1, 11, 2024);
	    System.out.println("November1 Should Increment To November2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testNovember1ShouldDecrementToOctober31() {
	    DateUtil date = new DateUtil(1, 11, 2024);
	    System.out.println("November1 Should Decrement To October31 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}

	@Test
	public void testDecember1ShouldIncrementToDecember2() {
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("December1 Should Increment To December2 " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testDecember1ShouldDecrementToNovember30() {
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("December1 Should Decrement To November30 " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}
	

	    @Test
	    public void test1A_1_6_1994_ShouldIncrementTo_2_6_1994() {
	        DateUtil date = new DateUtil(1, 6, 1994);
	        System.out.println("Test 1A: 1-6-1994 should increment to 2-6-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(2, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test2A_2_6_1994_ShouldIncrementTo_3_6_1994() {
	        DateUtil date = new DateUtil(2, 6, 1994);
	        System.out.println("Test 2A: 2-6-1994 should increment to 3-6-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(3, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test3A_15_6_1994_ShouldIncrementTo_16_6_1994() {
	        DateUtil date = new DateUtil(15, 6, 1994);
	        System.out.println("Test 3A: 15-6-1994 should increment to 16-6-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test4A_30_6_1994_ShouldIncrementTo_1_7_1994() {
	        DateUtil date = new DateUtil(30, 6, 1994);
	        System.out.println("Test 4A: 30-6-1994 should increment to 1-7-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(1, date.getDay());
	        Assert.assertEquals(7, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void testInvalidDate_31June1994_ShouldThrowException() {
	        System.out.println("Test Case: 31-6-1994 should throw an exception (RuntimeException expected)");
	        try {
	            DateUtil date = new DateUtil(31, 6, 1994);
	            // If execution reaches here, no exception was thrown, so the test should fail
	            Assert.fail("Expected RuntimeException for invalid date 31-6-1994");
	        } catch (RuntimeException e) {
	            System.out.println("Invalid Date caught: " + e.getClass().getSimpleName());
	            System.out.println("Exception message: " + e.getMessage());
	            // Optionally verify part of the exception message
	            Assert.assertTrue(e.getMessage().contains("Invalid"));
	        }
	    }


	    @Test
	    public void test6A_15_1_1994_ShouldIncrementTo_16_1_1994() {
	        DateUtil date = new DateUtil(15, 1, 1994);
	        System.out.println("Test 6A: 15-1-1994 should increment to 16-1-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(1, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test7A_15_2_1994_ShouldIncrementTo_16_2_1994() {
	        DateUtil date = new DateUtil(15, 2, 1994);
	        System.out.println("Test 7A: 15-2-1994 should increment to 16-2-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(2, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test8A_15_11_1994_ShouldIncrementTo_16_11_1994() {
	        DateUtil date = new DateUtil(15, 11, 1994);
	        System.out.println("Test 8A: 15-11-1994 should increment to 16-11-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(11, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test9A_15_12_1994_ShouldIncrementTo_16_12_1994() {
	        DateUtil date = new DateUtil(15, 12, 1994);
	        System.out.println("Test 9A: 15-12-1994 should increment to 16-12-1994");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(12, date.getMonth());
	        Assert.assertEquals(1994, date.getYear());
	    }

	    @Test
	    public void test10A_15_6_1700_ShouldIncrementTo_16_6_1700() {
	        DateUtil date = new DateUtil(15, 6, 1700);
	        System.out.println("Test 10A: 15-6-1700 should increment to 16-6-1700");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1700, date.getYear());
	    }

	    @Test
	    public void test11A_15_6_1701_ShouldIncrementTo_16_6_1701() {
	        DateUtil date = new DateUtil(15, 6, 1701);
	        System.out.println("Test 11A: 15-6-1701 should increment to 16-6-1701");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1701, date.getYear());
	    }

	    @Test
	    public void test12A_15_6_2023_ShouldIncrementTo_16_6_2023() {
	        DateUtil date = new DateUtil(15, 6, 2023);
	        System.out.println("Test 12A: 15-6-2023 should increment to 16-6-2023");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(2023, date.getYear());
	    }

	    @Test
	    public void test13A_15_6_2024_ShouldIncrementTo_16_6_2024() {
	        DateUtil date = new DateUtil(15, 6, 2024);
	        System.out.println("Test 13A: 15-6-2024 should increment to 16-6-2024");
	        date.increment();
	        System.out.println("Result: " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	        Assert.assertEquals(16, date.getDay());
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(2024, date.getYear());
	    }
	
}


