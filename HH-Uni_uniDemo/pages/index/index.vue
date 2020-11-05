<template>
	<view class="container">
		<button type="default" style="margin-top: 40rpx;" @click="goHome">跳转首页</button>
	</view>
</template>

<script>
	var plugins = require('../../common/plugins.js') 
	
	export default {

		methods: {
			goHome(){
				plugins.PluginTestFunction("goHome","62CBD53A0ED4D05CF696BE48B979BFE23F0D04F68EA2608F6783B874E4F50EEF");
			}
		}
	}
</script>

<style>
	.container {
		padding: 20px;
		font-size: 14px;
		line-height: 24px;
	}
</style>
