package news;

import base.CommonApi;
import org.testng.annotations.Test;

/**
 * Created by a on 12/23/2016.
 */
public class Search extends CommonApi{
    @Test
    public void searchNews() throws InterruptedException {
        clickByCss("#search-button");
        Thread.sleep(2000);
        typeByCss("#search-input-field","Politics");
        takeEnterKeys("#search-input-field");
        Thread.sleep(3000);
    }
}
