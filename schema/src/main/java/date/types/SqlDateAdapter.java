package date.types;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class SqlDateAdapter extends XmlAdapter<String, Date> {
    public Date unmarshal(String v) throws Exception {
        return new Date(new SimpleDateFormat("mm/dd/yyyy").parse(v).getTime());
    }

    public String marshal(Date v) throws Exception {
        return v.toString();
    }
}