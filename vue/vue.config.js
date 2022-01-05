module.exports = {
  outputDir: "../src/main/resources/static",
  indexPath: "../static/index.html",
  devServer: {
    port: 9091 ,
    proxy: "http://localhost:9191"
  }
  // presets: [
  //   '@vue/cli-plugin-babel/preset'
  // ]
}
