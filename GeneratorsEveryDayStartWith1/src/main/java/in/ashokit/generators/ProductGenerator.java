package in.ashokit.generators;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ProductGenerator implements IdentifierGenerator{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    private static final AtomicInteger SEQUENCE = new AtomicInteger(1);

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String prefix = "DG1106-";
        String currentDate = DATE_FORMAT.format(new Date());
        String numericPart = generateNumericPart();
        return prefix + currentDate + "-" + numericPart;
    }

    private String generateNumericPart() {
        // Generate a 4-digit sequence number with leading zeros
        int sequenceNumber = SEQUENCE.getAndIncrement();
        return String.format("%04d", sequenceNumber);
    }

}
