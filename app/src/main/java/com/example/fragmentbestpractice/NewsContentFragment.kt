package com.example.fragmentbestpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.news_content_frag.*

/**
 * 这个类用来管理双页模式下新闻内容的展示
 */
class NewsContentFragment : Fragment() {

    /**
     * 系统会在片段首次绘制其界面时调用此方法
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.news_content_frag, container, false)
    }

    fun refresh(title: String, content: String) {
        contentLayout.visibility = View.VISIBLE
        newsTitle.text = title // 刷新新闻的标题
        newsContent.text = content // 刷新新闻的内容
    }

}