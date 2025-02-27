/*
 * Copyright (C) 2018 Drake, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drake.brv.listener

import androidx.recyclerview.widget.RecyclerView
import com.drake.brv.BindingAdapter

/**
 * 实现[RecyclerView.Adapter.onBindViewHolder]接口回调
 */
interface OnBindViewHolderListener {
    fun onBindViewHolder(
        rv: RecyclerView,
        adapter: BindingAdapter,
        holder: BindingAdapter.BindingViewHolder,
        position: Int
    )
}