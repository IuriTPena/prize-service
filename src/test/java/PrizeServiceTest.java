import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import com.cognizant.prize.domain.Prize;
import com.cognizant.prize.service.PrizeService;



public class PrizeServiceTest {
	
@InjectMocks
private PrizeService ps; 

@Mock
private Prize p;


@Before
public void init() {
    MockitoAnnotations.initMocks(this);
}

	@Test
	public void prizeGenerator() {
		
		System.out.println("Testing prize generator");
		
		// when(ps.prizeGenerator("A123456")).thenReturn(prize);
		assertEquals("25", ps.prizeGenerator("A123456").getValue().toString());
		assertEquals("50", ps.prizeGenerator("B123456").getValue().toString());
		assertEquals("0", ps.prizeGenerator("C123456").getValue().toString());
		
		assertEquals("100", ps.prizeGenerator("A12345624").getValue().toString());
		assertEquals("200", ps.prizeGenerator("B12345624").getValue().toString());
		assertEquals("0", ps.prizeGenerator("C12345624").getValue().toString());
		
		assertEquals("400", ps.prizeGenerator("A1234562412").getValue().toString());
		assertEquals("800", ps.prizeGenerator("B1234562467").getValue().toString());
		assertEquals("0", ps.prizeGenerator("C1234562490").getValue().toString());
		
		
	}
}
