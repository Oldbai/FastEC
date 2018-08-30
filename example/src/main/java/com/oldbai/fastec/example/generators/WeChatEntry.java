package com.oldbai.fastec.example.generators;

import com.oldbai.latte_annotations.annotations.EntryGenerator;
import com.oldbai.latte_core.wechat.template.WXEntryTemplate;

@EntryGenerator(
        packageName = "com.oldbai.fastec.example",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
