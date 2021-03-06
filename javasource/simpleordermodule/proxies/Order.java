// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package simpleordermodule.proxies;

public class Order extends pdf_exporter.proxies.AnyObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SimpleOrderModule.Order";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OrderNumber("OrderNumber"),
		TotalAmount("TotalAmount"),
		DateCreated("DateCreated"),
		Order_Customer("SimpleOrderModule.Order_Customer"),
		AnyObject_PDFTemplate("PDF_Exporter.AnyObject_PDFTemplate");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Order(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SimpleOrderModule.Order"));
	}

	protected Order(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject orderMendixObject)
	{
		super(context, orderMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SimpleOrderModule.Order", orderMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SimpleOrderModule.Order");
	}

	/**
	 * @deprecated Use 'Order.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static simpleordermodule.proxies.Order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return simpleordermodule.proxies.Order.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static simpleordermodule.proxies.Order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new simpleordermodule.proxies.Order(context, mendixObject);
	}

	public static simpleordermodule.proxies.Order load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return simpleordermodule.proxies.Order.initialize(context, mendixObject);
	}

	public static java.util.List<simpleordermodule.proxies.Order> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<simpleordermodule.proxies.Order> result = new java.util.ArrayList<simpleordermodule.proxies.Order>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SimpleOrderModule.Order" + xpathConstraint))
			result.add(simpleordermodule.proxies.Order.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OrderNumber
	 */
	public final Long getOrderNumber()
	{
		return getOrderNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderNumber
	 */
	public final Long getOrderNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.OrderNumber.toString());
	}

	/**
	 * Set value of OrderNumber
	 * @param ordernumber
	 */
	public final void setOrderNumber(Long ordernumber)
	{
		setOrderNumber(getContext(), ordernumber);
	}

	/**
	 * Set value of OrderNumber
	 * @param context
	 * @param ordernumber
	 */
	public final void setOrderNumber(com.mendix.systemwideinterfaces.core.IContext context, Long ordernumber)
	{
		getMendixObject().setValue(context, MemberNames.OrderNumber.toString(), ordernumber);
	}

	/**
	 * @return value of TotalAmount
	 */
	public final Double getTotalAmount()
	{
		return getTotalAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalAmount
	 */
	public final Double getTotalAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.TotalAmount.toString());
	}

	/**
	 * Set value of TotalAmount
	 * @param totalamount
	 */
	public final void setTotalAmount(Double totalamount)
	{
		setTotalAmount(getContext(), totalamount);
	}

	/**
	 * Set value of TotalAmount
	 * @param context
	 * @param totalamount
	 */
	public final void setTotalAmount(com.mendix.systemwideinterfaces.core.IContext context, Double totalamount)
	{
		getMendixObject().setValue(context, MemberNames.TotalAmount.toString(), totalamount);
	}

	/**
	 * @return value of DateCreated
	 */
	public final java.util.Date getDateCreated()
	{
		return getDateCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of DateCreated
	 */
	public final java.util.Date getDateCreated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateCreated.toString());
	}

	/**
	 * Set value of DateCreated
	 * @param datecreated
	 */
	public final void setDateCreated(java.util.Date datecreated)
	{
		setDateCreated(getContext(), datecreated);
	}

	/**
	 * Set value of DateCreated
	 * @param context
	 * @param datecreated
	 */
	public final void setDateCreated(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datecreated)
	{
		getMendixObject().setValue(context, MemberNames.DateCreated.toString(), datecreated);
	}

	/**
	 * @return value of Order_Customer
	 */
	public final simpleordermodule.proxies.Customer getOrder_Customer() throws com.mendix.core.CoreException
	{
		return getOrder_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of Order_Customer
	 */
	public final simpleordermodule.proxies.Customer getOrder_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		simpleordermodule.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Order_Customer.toString());
		if (identifier != null)
			result = simpleordermodule.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Order_Customer
	 * @param order_customer
	 */
	public final void setOrder_Customer(simpleordermodule.proxies.Customer order_customer)
	{
		setOrder_Customer(getContext(), order_customer);
	}

	/**
	 * Set value of Order_Customer
	 * @param context
	 * @param order_customer
	 */
	public final void setOrder_Customer(com.mendix.systemwideinterfaces.core.IContext context, simpleordermodule.proxies.Customer order_customer)
	{
		if (order_customer == null)
			getMendixObject().setValue(context, MemberNames.Order_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Order_Customer.toString(), order_customer.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final simpleordermodule.proxies.Order that = (simpleordermodule.proxies.Order) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SimpleOrderModule.Order";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
