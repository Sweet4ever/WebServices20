import x.snowroller.plugin.ExternalPage;
import x.snowroller.plugin.SwedishPage;
import x.snowroller.spi.Page;

module plugin {
    requires x.snowroller.spi;
    provides Page with ExternalPage, SwedishPage;
}