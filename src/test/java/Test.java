import com.pgman.goku.util.DateUtils;
import com.pgman.goku.util.KafkaUtils;
import com.pgman.goku.util.MockDataUtils;
import com.pgman.goku.util.ObjectUtils;

import java.text.ParseException;
import java.util.Date;

public class Test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MockDataUtils.mockOrderStreamData(false,5000,3);
    }


    @org.junit.Test
    public void test() throws ParseException {
        Date date = new Date();
        String s = DateUtils.timeAddOnSecond(new Date(), 10);
        System.out.println(s.substring(0,10));

        System.out.println(DateUtils.dateFormat(date,DateUtils.DATE_TIME_PATTERN));
        System.out.println(s);

        String s1 = DateUtils.timeAddOnSecond(new Date(), -10);
        Date date1 = DateUtils.dateParse(DateUtils.timeAddOnSecond(new Date(), -10), DateUtils.DATE_TIME_PATTERN);


    }

}
