import { useState } from "react";
import "./App.css";
import data from "./data/data.json"; // ✅ FIXED PATH
import MetricsChart from "./components/MetricsChart";

function App() {
  const [selectedDev, setSelectedDev] = useState(
    data.developers?.[0]?.developer_id || ""
  );

  // ✅ SAFE FILTERING
  const issues = (data.issues || []).filter(
    (i) => i.developer_id === selectedDev
  );

  const prs = (data.prs || []).filter(
    (p) => p.developer_id === selectedDev
  );

  const deployments = (data.deployments || []).filter(
    (d) =>
      d.developer_id === selectedDev &&
      d.status === "success"
  );

  const bugs = (data.bugs || []).filter(
    (b) =>
      b.developer_id === selectedDev &&
      (b.escaped_to_prod === "Yes" || b.escaped_to_prod === true)
  );

  // ================= METRICS =================

  const cycleTime =
    issues.length > 0
      ? issues.reduce((sum, i) => sum + (i.cycle_time_days || 0), 0) /
        issues.length
      : 0;

  const prThroughput = prs.length;

  const deploymentFrequency = deployments.length;

  const bugRate =
    issues.length > 0 ? bugs.length / issues.length : 0;

  const leadTime =
    deployments.length > 0
      ? deployments.reduce(
          (sum, d) => sum + (d.lead_time_days || 0),
          0
        ) / deployments.length
      : 0;

  const avgReviewWait =
    prs.length > 0
      ? prs.reduce(
          (sum, p) => sum + (p.review_wait_hours || 0),
          0
        ) / prs.length
      : 0;

  // ================= INSIGHTS =================
// ================= INSIGHTS =================

let insights = [];
let suggestions = [];

if (issues.length === 0) {
  insights.push("No activity data found.");
  suggestions.push("Select another developer.");
} else {
  if (cycleTime > 4) {
    insights.push("Cycle time is slightly high.");
    suggestions.push("Break tasks into smaller parts.");
  }

  if (bugRate > 0.1) {
    insights.push("Bug rate needs attention.");
    suggestions.push("Improve testing coverage.");
  }

  if (prThroughput < 4) {
    insights.push("PR throughput could be improved.");
    suggestions.push("Increase contribution frequency.");
  }

  if (deploymentFrequency < 4) {
    insights.push("Deployment frequency is low.");
    suggestions.push("Deploy smaller changes more often.");
  }

  if (leadTime > 3) {
    insights.push("Lead time is increasing.");
    suggestions.push("Optimize CI/CD pipeline.");
  }

  if (avgReviewWait > 10) {
    insights.push("PR review delays detected.");
    suggestions.push("Follow up with reviewers faster.");
  }

  if (insights.length === 0) {
    insights.push("Good performance overall.");
    suggestions.push("Maintain current workflow.");
  }
}

  return (
  <div className="container">
    <h1 className="title">🚀 Developer Productivity Dashboard</h1>

    {/* Dropdown */}
    <div className="card">
      <label>Select Developer:</label>
      <select
        value={selectedDev}
        onChange={(e) => setSelectedDev(e.target.value)}
      >
        {(data.developers || []).map((dev) => (
          <option key={dev.developer_id} value={dev.developer_id}>
            {dev.developer_name}
          </option>
        ))}
      </select>
    </div>

    {/* Metrics Cards */}
    <div className="metrics-grid">
      <div className="metric-card">
        <h3>Cycle Time</h3>
        <p>{cycleTime.toFixed(2)} days</p>
      </div>

      <div className="metric-card">
        <h3>Lead Time</h3>
        <p>{leadTime.toFixed(2)} days</p>
      </div>

      <div className="metric-card">
        <h3>PR Throughput</h3>
        <p>{prThroughput}</p>
      </div>

      <div className="metric-card">
        <h3>Deployments</h3>
        <p>{deploymentFrequency}</p>
      </div>

      <div className="metric-card">
        <h3>Bug Rate</h3>
        <p>{bugRate.toFixed(2)}</p>
      </div>

      <div className="metric-card">
        <h3>Review Wait</h3>
        <p>{avgReviewWait.toFixed(2)} hrs</p>
      </div>
    </div>

    {/* Chart */}
    <div className="card">
      <h2>📊 Performance Overview</h2>
      <MetricsChart
        cycleTime={cycleTime}
        leadTime={leadTime}
        prThroughput={prThroughput}
        deploymentFrequency={deploymentFrequency}
        bugRate={bugRate}
      />
    </div>

    {/* Insights */}
    <div className="card insight">
      <h2>🧠 Insights</h2>
      <ul>
        {insights.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>

    {/* Suggestions */}
    <div className="card suggestion">
      <h2>⚡ Suggestions</h2>
      <ul>
        {suggestions.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
    </div>
);
}

export default App;