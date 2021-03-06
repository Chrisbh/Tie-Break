package BE;

import java.util.Calendar;

public class MembershipFee
{

    private int memberId;
    private int typeId;
    private int amount;
    private Calendar invoiceSent;
    private Calendar paymentReceived;

    /**
     * Constructor for membership fee with everything
     *
     * @param memberId member id
     * @param typeId membership type id
     * @param invoiceSent when the invoice was sent
     * @param paymentReceived when the payment was received
     */
    public MembershipFee(int memberId, int typeId, int amount, Calendar invoiceSent, Calendar paymentReceived)
    {
        this.memberId = memberId;
        this.typeId = typeId;
        this.amount = amount;
        this.invoiceSent = invoiceSent;
        this.paymentReceived = paymentReceived;
    }

    /**
     * Constructor for membership fee with just a membership fee object
     *
     * @param mf A given membership fee
     */
    public MembershipFee(int memberId, int typeId, int amount, Calendar invoiceSent)
    {
        this(memberId, typeId, amount, invoiceSent, null);
    }

    /**
     * Returns the member id of the member fee
     *
     * @return the memberId
     */
    public int getMemberId()
    {
        return memberId;
    }

    /**
     * Returns the membership type ID
     *
     * @return the typeId
     */
    public int getTypeId()
    {
        return typeId;
    }

    /**
     * Sets the membership type ID
     *
     * @param typeId the typeId to set
     */
    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }

    /**
     * Returns the date the invoice was sent
     *
     * @return the invoiceSent
     */
    public Calendar getInvoiceSent()
    {
        return invoiceSent;
    }

    /**
     * Sets the date the invoice was sent
     *
     * @param invoiceSent the invoiceSent to set
     */
    public void setInvoiceSent(Calendar invoiceSent)
    {
        this.invoiceSent = invoiceSent;
    }

    /**
     * Returns the date the payment was received
     *
     * @return the paymentReceived
     */
    public Calendar getPaymentReceived()
    {
        return paymentReceived;
    }

    /**
     * Sets the date the payment was received
     *
     * @param paymentReceived the paymentReceived to set
     */
    public void setPaymentReceived(Calendar paymentReceived)
    {
        this.paymentReceived = paymentReceived;
    }

    /**
     * Returns the amount of the invoice
     *
     * @return the amount
     */
    public int getAmount()
    {
        return amount;
    }

    /**
     * Sets the amount to the invoice
     *
     * @param amount the amount to set
     */
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
}
