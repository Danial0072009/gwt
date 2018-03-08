package gwt.material.design.client.ui.pager;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialDataPagerClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.client.ui.pager.MaterialDataPagerClientBundle {
  private static MaterialDataPagerClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialDataPagerClientBundle_default_InlineClientBundleGenerator();
  private void dataPagerCssInitializer() {
    dataPagerCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/danial/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.0.1/gwt-material-table-2.0.1.jar!/gwt/material/design/client/ui/pager/resources/css/data-pager.min.css
      public String getText() {
        return ".table-container .data-pager{width:100%;position:relative;padding:4px;color:#9e9e9e!important;font-size:.8em;margin-bottom:0}.data-pager .action-page-panel i,.data-pager .action-page-panel>span,.data-pager .num-page-panel>span,.data-pager .rows-per-page-panel>span{float:right;margin-right:8px;margin-top:12px}.data-pager .action-page-panel{margin-top:12px}.data-pager .action-page-panel i{margin-top:4px}.data-pager .action-page-panel i.disabled{background:#fff!important;color:#e9e9e9!important}.data-pager .num-page-panel .select-wrapper,.data-pager .rows-per-page-panel .select-wrapper{float:right;width:44px;max-width:64px;margin-left:32px}.data-pager .num-page-panel .select-dropdown,.data-pager .rows-per-page-panel .select-dropdown{border:none;margin-bottom:0;font-size:1em}.data-pager .select-wrapper .caret{color:#9e9e9e!important}";
      }
      public String getName() {
        return "dataPagerCss";
      }
    }
    ;
  }
  private static class dataPagerCssInitializer {
    static {
      _instance0.dataPagerCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return dataPagerCss;
    }
  }
  public com.google.gwt.resources.client.TextResource dataPagerCss() {
    return dataPagerCssInitializer.get();
  }
  private void dataPagerDebugCssInitializer() {
    dataPagerDebugCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/danial/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.0.1/gwt-material-table-2.0.1.jar!/gwt/material/design/client/ui/pager/resources/css/data-pager.css
      public String getText() {
        return ".table-container .data-pager {\n    width: 100%;\n    position: relative;\n    padding: 4px;\n    color: #9e9e9e !important;\n    font-size: 0.8em;\n    margin-bottom: 0;\n}\n\n.data-pager .action-page-panel > span, .data-pager .rows-per-page-panel > span, .data-pager .num-page-panel > span, .data-pager .action-page-panel i {\n    float: right;\n    margin-right: 8px;\n    margin-top: 12px;\n}\n\n.data-pager .action-page-panel {\n    margin-top: 12px;\n}\n\n.data-pager .action-page-panel i {\n    margin-top: 4px;\n}\n\n.data-pager .action-page-panel i.disabled {\n    background: white !important;\n    color: #e9e9e9 !important;\n}\n\n.data-pager .rows-per-page-panel .select-wrapper, .data-pager .num-page-panel .select-wrapper {\n    float: right;\n    width: 44px;\n    max-width: 64px;\n    margin-left: 32px;\n}\n\n.data-pager .rows-per-page-panel .select-dropdown, .data-pager .num-page-panel .select-dropdown {\n    border: none;\n    margin-bottom: 0;\n    font-size: 1em;\n}\n\n.data-pager .select-wrapper .caret {\n    color: #9e9e9e !important;\n}";
      }
      public String getName() {
        return "dataPagerDebugCss";
      }
    }
    ;
  }
  private static class dataPagerDebugCssInitializer {
    static {
      _instance0.dataPagerDebugCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return dataPagerDebugCss;
    }
  }
  public com.google.gwt.resources.client.TextResource dataPagerDebugCss() {
    return dataPagerDebugCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource dataPagerCss;
  private static com.google.gwt.resources.client.TextResource dataPagerDebugCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      dataPagerCss(), 
      dataPagerDebugCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("dataPagerCss", dataPagerCss());
        resourceMap.put("dataPagerDebugCss", dataPagerDebugCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'dataPagerCss': return this.@gwt.material.design.client.ui.pager.MaterialDataPagerClientBundle::dataPagerCss()();
      case 'dataPagerDebugCss': return this.@gwt.material.design.client.ui.pager.MaterialDataPagerClientBundle::dataPagerDebugCss()();
    }
    return null;
  }-*/;
}
