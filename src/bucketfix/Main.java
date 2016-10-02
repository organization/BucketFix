package bucketfix;

import bucketfix.item.Bucket;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {
	@Override
	public void onLoad() {
		Item.list[Item.BUCKET] = Bucket.class;
	}
}
