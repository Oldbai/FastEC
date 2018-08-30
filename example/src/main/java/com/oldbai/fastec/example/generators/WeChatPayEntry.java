package com.oldbai.fastec.example.generators;

import com.oldbai.latte_annotations.annotations.PayEntryGenerator;
import com.oldbai.latte_core.wechat.template.WXPayEntryTemplate;

@PayEntryGenerator(
        packageName = "com.oldbai.fastec.example",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
