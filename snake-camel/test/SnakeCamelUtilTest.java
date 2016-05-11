import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import snakecamel.SnakeCamelUtil;

public class SnakeCamelUtilTest {

	@Test
	public void abc_deftoAbcDefTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="AbcDef";
		String actual = scu.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}
	public void abc_def_ghitoAbcDefGhiTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
	}
	public void AbcDefGhiToabc_def_ghiTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expected));
	}
	public void OtaHitohaToota_hitohaTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected ="ota_hitoha";
		String actual = scu.camelToSnakecase("OtaHitoha");
		assertThat(actual,is(expected));
	}
}
