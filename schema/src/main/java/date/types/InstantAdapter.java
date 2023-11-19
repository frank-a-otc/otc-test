package date.types;

import java.time.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class InstantAdapter extends XmlAdapter<String, Instant> {
    public Instant unmarshal(String v) throws Exception {
        return Instant.parse(v);
    }

    public String marshal(Instant v) throws Exception {
        return v.toString();
    }
}