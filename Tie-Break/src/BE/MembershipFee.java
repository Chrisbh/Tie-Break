package BE;

import java.util.Calendar;

public class MembershipFee
{

    private int memberId;
    private int typeId;
    private Calendar invoiceSent;
    private Calendar paymentReceived;

    /*
     * Constructor for membership fee with everything
     */
    public MembershipFee(int memberId, int typeId, Calendar invoiceSent, Calendar paymentReceived)
    {
        this.memberId = memberId;
        this.typeId = typeId;
        this.invoiceSent = invoiceSent;
        this.paymentReceived = paymentReceived;
    }

    /*
     * Constructor for membership fee with just a membership fee object
     */
    public MembershipFee(int id, int typeId, Calendar invoiceSent)
    {
        this(id, typeId, invoiceSent, null);
    }

    /**
     * Returns the member id of the member fee
     * @return the memberId
     */
    public int getMemberId()
    {
        return memberId;
    }

    /**
     * Returns the membership type ID
     * @return the typeId
     */
    public int getTypeId()
    {
        return typeId;
    }

    /**
     * Sets the membership type ID
     * @param typeId the typeId to set
     */
    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }

    /**
     * Returns the date the invoice was sent
     * @return the invoiceSent
     */
    public Calendar getInvoiceSent()
    {
        return invoiceSent;
    }

    /**
     * Sets the date the invoice was sent
     * @param invoiceSent the invoiceSent to set
     */
    public void setInvoiceSent(Calendar invoiceSent)
    {
        this.invoiceSent = invoiceSent;
    }

    /**
     * Returns the date the payment was received
     * @return the paymentReceived
     */
    public Calendar getPaymentReceived()
    {
        return paymentReceived;
    }

    /**
     * Sets the date the payment was received
     * @param paymentReceived the paymentReceived to set
     */
    public void setPaymentReceived(Calendar paymentReceived)
    {
        this.paymentReceived = paymentReceived;
    }

}
