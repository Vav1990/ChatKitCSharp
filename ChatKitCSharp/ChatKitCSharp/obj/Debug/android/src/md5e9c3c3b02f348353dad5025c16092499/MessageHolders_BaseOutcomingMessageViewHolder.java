package md5e9c3c3b02f348353dad5025c16092499;


public abstract class MessageHolders_BaseOutcomingMessageViewHolder
	extends md5e9c3c3b02f348353dad5025c16092499.MessageHolders_BaseMessageViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ChatKitCSharp.Messages.MessageHolders+BaseOutcomingMessageViewHolder, ChatKitCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MessageHolders_BaseOutcomingMessageViewHolder.class, __md_methods);
	}


	public MessageHolders_BaseOutcomingMessageViewHolder (android.view.View p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == MessageHolders_BaseOutcomingMessageViewHolder.class)
			mono.android.TypeManager.Activate ("ChatKitCSharp.Messages.MessageHolders+BaseOutcomingMessageViewHolder, ChatKitCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
